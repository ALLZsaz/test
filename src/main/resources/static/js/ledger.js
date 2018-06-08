var app = angular.module('ledger', []);

app.controller("LedgerController", function ($scope, $http) {

    $scope.getLedger = function () {
        $http.get('/rest/ledger').success(function (data, status, headers, config) {
            $scope.dList = data;

        }).error(function (data, status, headers, config) {
            if (data.message === 'Time is out') {
                $scope.finishByTimeout();
            }
        });
    };

    $scope.delete = function (num) {

        if (num === "") num = undefined;

        $http.delete('/rest/ledger/delete/' + num).success(function (data, status, headers, config) {
            for (var i = 0, len = $scope.dList.length; i < len; i++) {
                var j = $scope.dList[i];
                if (j.num === num) {
                    $scope.dList.splice(i, 1);
                    break;
                }
            }
        }).error(function (data, status, headers, config) {
            $scope.errorMessage = data.message;
            $scope.isAddError = false;
            console.error(status, data, headers);
        });
    };

    $scope.addMonth = function (num, month_name, water, electricity) {

        if (num === "") num = undefined;
        if (month_name === "") month_name = undefined;
        if (water === "") water = undefined;
        if (electricity === "") electricity = undefined;

        $http.post('/rest/ledger/add/' + num  + "/" + month_name + "/" + water + "/" + electricity).success(function (data, status, headers, config) {

                $scope.dList.splice(0, 0, data);
            }
        ).error(function (data, status, headers, config) {
            $scope.errorMessage = data.message;
            $scope.isAddError = true;
            console.error(status, data, headers);
        });

    };
});
