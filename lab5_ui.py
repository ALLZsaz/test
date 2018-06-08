# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'lab5.ui'
#
# Created by: PyQt4 UI code generator 4.11.4
#
# WARNING! All changes made in this file will be lost!

from PyQt4 import QtCore, QtGui

try:
    _fromUtf8 = QtCore.QString.fromUtf8
except AttributeError:
    def _fromUtf8(s):
        return s

try:
    _encoding = QtGui.QApplication.UnicodeUTF8
    def _translate(context, text, disambig):
        return QtGui.QApplication.translate(context, text, disambig, _encoding)
except AttributeError:
    def _translate(context, text, disambig):
        return QtGui.QApplication.translate(context, text, disambig)

class Ui_MainWindow(object):
    def setupUi(self, MainWindow):
        MainWindow.setObjectName(_fromUtf8("MainWindow"))
        MainWindow.resize(607, 510)
        sizePolicy = QtGui.QSizePolicy(QtGui.QSizePolicy.Fixed, QtGui.QSizePolicy.Fixed)
        sizePolicy.setHorizontalStretch(0)
        sizePolicy.setVerticalStretch(0)
        sizePolicy.setHeightForWidth(MainWindow.sizePolicy().hasHeightForWidth())
        MainWindow.setSizePolicy(sizePolicy)
        self.centralwidget = QtGui.QWidget(MainWindow)
        self.centralwidget.setObjectName(_fromUtf8("centralwidget"))
        self.plainTextEditWeights = QtGui.QPlainTextEdit(self.centralwidget)
        self.plainTextEditWeights.setGeometry(QtCore.QRect(20, 130, 271, 121))
        self.plainTextEditWeights.setObjectName(_fromUtf8("plainTextEditWeights"))
        self.layoutWidget = QtGui.QWidget(self.centralwidget)
        self.layoutWidget.setGeometry(QtCore.QRect(20, 20, 115, 76))
        self.layoutWidget.setObjectName(_fromUtf8("layoutWidget"))
        self.gridLayout = QtGui.QGridLayout(self.layoutWidget)
        self.gridLayout.setObjectName(_fromUtf8("gridLayout"))
        self.label_2 = QtGui.QLabel(self.layoutWidget)
        self.label_2.setObjectName(_fromUtf8("label_2"))
        self.gridLayout.addWidget(self.label_2, 0, 0, 1, 1)
        self.label = QtGui.QLabel(self.layoutWidget)
        self.label.setObjectName(_fromUtf8("label"))
        self.gridLayout.addWidget(self.label, 0, 1, 1, 1)
        self.spinBoxWidth = QtGui.QSpinBox(self.layoutWidget)
        self.spinBoxWidth.setMinimum(1)
        self.spinBoxWidth.setObjectName(_fromUtf8("spinBoxWidth"))
        self.gridLayout.addWidget(self.spinBoxWidth, 2, 0, 1, 1)
        self.spinBoxHeight = QtGui.QSpinBox(self.layoutWidget)
        self.spinBoxHeight.setMinimum(1)
        self.spinBoxHeight.setObjectName(_fromUtf8("spinBoxHeight"))
        self.gridLayout.addWidget(self.spinBoxHeight, 2, 1, 1, 1)
        self.label_3 = QtGui.QLabel(self.centralwidget)
        self.label_3.setGeometry(QtCore.QRect(20, 110, 53, 16))
        self.label_3.setObjectName(_fromUtf8("label_3"))
        self.label_4 = QtGui.QLabel(self.centralwidget)
        self.label_4.setGeometry(QtCore.QRect(310, 110, 53, 16))
        self.label_4.setObjectName(_fromUtf8("label_4"))
        self.plainTextEditWalls = QtGui.QPlainTextEdit(self.centralwidget)
        self.plainTextEditWalls.setGeometry(QtCore.QRect(310, 130, 271, 121))
        self.plainTextEditWalls.setObjectName(_fromUtf8("plainTextEditWalls"))
        self.plainTextEditPath = QtGui.QPlainTextEdit(self.centralwidget)
        self.plainTextEditPath.setGeometry(QtCore.QRect(20, 290, 561, 87))
        self.plainTextEditPath.setObjectName(_fromUtf8("plainTextEditPath"))
        self.label_5 = QtGui.QLabel(self.centralwidget)
        self.label_5.setGeometry(QtCore.QRect(20, 270, 53, 16))
        self.label_5.setObjectName(_fromUtf8("label_5"))
        self.pushButton = QtGui.QPushButton(self.centralwidget)
        self.pushButton.setGeometry(QtCore.QRect(200, 400, 93, 31))
        self.pushButton.setObjectName(_fromUtf8("pushButton"))
        self.pushButton_2 = QtGui.QPushButton(self.centralwidget)
        self.pushButton_2.setGeometry(QtCore.QRect(310, 400, 93, 31))
        self.pushButton_2.setObjectName(_fromUtf8("pushButton_2"))
        self.widget = QtGui.QWidget(self.centralwidget)
        self.widget.setGeometry(QtCore.QRect(180, 10, 261, 81))
        self.widget.setObjectName(_fromUtf8("widget"))
        self.gridLayout_2 = QtGui.QGridLayout(self.widget)
        self.gridLayout_2.setObjectName(_fromUtf8("gridLayout_2"))
        self.label_6 = QtGui.QLabel(self.widget)
        self.label_6.setObjectName(_fromUtf8("label_6"))
        self.gridLayout_2.addWidget(self.label_6, 0, 0, 1, 1)
        self.label_7 = QtGui.QLabel(self.widget)
        self.label_7.setObjectName(_fromUtf8("label_7"))
        self.gridLayout_2.addWidget(self.label_7, 0, 1, 1, 1)
        self.plainTextEditStart = QtGui.QPlainTextEdit(self.widget)
        self.plainTextEditStart.setObjectName(_fromUtf8("plainTextEditStart"))
        self.gridLayout_2.addWidget(self.plainTextEditStart, 1, 0, 1, 1)
        self.plainTextEditGoal = QtGui.QPlainTextEdit(self.widget)
        self.plainTextEditGoal.setObjectName(_fromUtf8("plainTextEditGoal"))
        self.gridLayout_2.addWidget(self.plainTextEditGoal, 1, 1, 1, 1)
        self.plainTextEditWeights.raise_()
        self.layoutWidget.raise_()
        self.label_3.raise_()
        self.label.raise_()
        self.label_4.raise_()
        self.plainTextEditWalls.raise_()
        self.plainTextEditPath.raise_()
        self.label_5.raise_()
        self.pushButton.raise_()
        self.pushButton_2.raise_()
        self.plainTextEditStart.raise_()
        self.label_6.raise_()
        self.label_7.raise_()
        self.plainTextEditGoal.raise_()
        MainWindow.setCentralWidget(self.centralwidget)
        self.menubar = QtGui.QMenuBar(MainWindow)
        self.menubar.setGeometry(QtCore.QRect(0, 0, 607, 26))
        self.menubar.setObjectName(_fromUtf8("menubar"))
        MainWindow.setMenuBar(self.menubar)
        self.statusbar = QtGui.QStatusBar(MainWindow)
        self.statusbar.setObjectName(_fromUtf8("statusbar"))
        MainWindow.setStatusBar(self.statusbar)

        self.retranslateUi(MainWindow)
        QtCore.QMetaObject.connectSlotsByName(MainWindow)

    def retranslateUi(self, MainWindow):
        MainWindow.setWindowTitle(_translate("MainWindow", "MainWindow", None))
        self.label_2.setText(_translate("MainWindow", "width", None))
        self.label.setText(_translate("MainWindow", "height", None))
        self.label_3.setText(_translate("MainWindow", "weights", None))
        self.label_4.setText(_translate("MainWindow", "walls", None))
        self.label_5.setText(_translate("MainWindow", "path", None))
        self.pushButton.setText(_translate("MainWindow", "Ok", None))
        self.pushButton_2.setText(_translate("MainWindow", "Clear", None))
        self.label_6.setText(_translate("MainWindow", "start", None))
        self.label_7.setText(_translate("MainWindow", "goal", None))

