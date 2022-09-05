
public class AccountMt4 {
    private Integer id;
    private Integer account;
    private Integer dataSourceId;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public AccountMt4(Integer id, Integer account, Integer dataSourceId) {
        this.id = id;
        this.account = account;
        this.dataSourceId = dataSourceId;
    }
    public Integer getAccount() {
        return account;
    }
    @Override
    public String toString() {
        return "AccountMt4 [account=" + account + ", dataSourceId=" + dataSourceId + ", id=" + id + "]";
    }
    public void setAccount(Integer account) {
        this.account = account;
    }
    public Integer getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
}