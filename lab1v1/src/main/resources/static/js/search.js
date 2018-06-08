var app = angular.module('search', []);

app.controller("SearchController", function ($scope, $http) {
    $scope.search = function (month_name) {
        if (month_name === "") month_name = undefined;
        $http.post('/rest/search/' + month_name).success(function (data, status, headers, config) {
                $scope.isSearchError = false;
                $scope.dList = data;
            }
        ).error(function (data, status, headers, config) {
            $scope.errorMessage = data.message;
            $scope.isSearchError = true;
            console.error(status, data, headers);
        });
    };
});
