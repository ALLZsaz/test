package listservice;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DataList {
    private static List<Data> dataList = new ArrayList<>();

    static {
        dataList.add(new Data(1, "январь", 11.12, 22.2));
        dataList.add(new Data(2, "февраль", 15.1, 21));
        dataList.add(new Data(3, "март", 17.4, 18));
        dataList.add(new Data(4, "апрель", 14.7, 17.6));
    }

    public void addData(Data data){
        dataList.add(data);
    }

    public Data addData(int num, String month_name, double water, double electricity) {
        Data newData = new Data(num, month_name, water, electricity);
        dataList.add(newData);
        return newData;

    }

    public boolean delData(int num)
    {
        Iterator<Data> iterator = dataList.iterator();
        while (iterator.hasNext()) {
            Data curData = iterator.next();
            if (curData.getNum() == num) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public List<Data> searchData(String month_name) {
        List<Data> result = new LinkedList<>();
        if (month_name == null) return result;
        for (Data data:dataList) {
            if (data.getMonth_name().toLowerCase().equals(month_name.toLowerCase())) result.add(data);
        }
        return result;
    }

    public List<Data> getDataList() {
        return dataList;
    }
}
