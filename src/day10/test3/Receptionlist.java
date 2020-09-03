package day10.test3;

public class Receptionlist {
    Filter filter;

    public Receptionlist(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void receptUser(User user) {
       filter.filterUser(user);
    }
}
