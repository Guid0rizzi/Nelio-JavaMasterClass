package Section6.Exercise.Model.Entities;

public class BusinessException extends RuntimeException  {
    /* quando eu uso o RuntimeException eu não preciso propagar a classe.
    é só usa-la em outro lugar
    */
  private static final long serialVersionUID = 1L;
    public BusinessException(String msg) {
        super(msg);
    }
}
