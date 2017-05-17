package cc.tinker.entry.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by whoszus on 2017/4/10.
 *
 * @email whoszus@yahoo.com
 */
public class BootstrapTableEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer currentPage;
    private Integer pageSize;
    private Long total;
    private List<T> rows;

    public BootstrapTableEntity(List<T> rows, Long total, Integer pageSize, Integer currentPage) {
        this.total = total;
        this.rows = rows;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }

    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return this.total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return this.rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
