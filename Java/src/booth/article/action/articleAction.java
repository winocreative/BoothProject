package booth.article.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface articleAction {
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException;
}
