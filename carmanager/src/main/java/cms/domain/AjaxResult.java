package cms.domain;

public class AjaxResult {
  protected String status;
  protected Object data;
  
  public AjaxResult() {}

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
  
}