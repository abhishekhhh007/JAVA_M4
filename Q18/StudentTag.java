
import java.io.IOException;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class StudentTag extends SimpleTagSupport {

    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();

        out.println("<h3>Student Information</h3>");
        out.println("<p>Name: Abhishek Sukumaran</p>");
        out.println("<p>Course: Computer Science</p>");
        out.println("<p>Marks: 85</p>");
    }
}
