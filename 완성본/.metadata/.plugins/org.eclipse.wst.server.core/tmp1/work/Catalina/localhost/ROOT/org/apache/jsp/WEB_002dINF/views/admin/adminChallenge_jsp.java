/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-09-27 03:06:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.earthpurging.index.model.vo.ChellengeMemberData;
import com.earthpurging.member.model.vo.Member;

public final class adminChallenge_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1664243429901L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1663920910595L));
    _jspx_dependants.put("/WEB-INF/views/admin/adminSide.jsp", Long.valueOf(1664172377675L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.earthpurging.index.model.vo.ChellengeMemberData");
    _jspx_imports_classes.add("com.earthpurging.member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>관리자페이지 - 챌린지관리</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/style-mypage-admin.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");

		Member m = (Member)session.getAttribute("m");
    
    	ChellengeMemberData cmd = (ChellengeMemberData)session.getAttribute("cmd"); 
	
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700;800&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/reset.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/default.css\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-3.6.0.js\"></script>\r\n");
      out.write("<!-- header -->\r\n");
      out.write("<header>\r\n");
      out.write("    <div class=\"header-container\">\r\n");
      out.write("        <div class=\"header-top\">\r\n");
      out.write("            <div class=\"header-logo\">\r\n");
      out.write("                <a href=\"/\"><img src=\"/img/common/logo-plogging.png\" alt=\"plogging\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"header-center\">\r\n");
      out.write("                <a href=\"/\"><img src=\"/img/common/img-main-title.png\" alt=\"\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"header-button\">\r\n");
      out.write("                <a href=\"\" >지구쓰담 후원하기</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"header-bottom\">\r\n");
      out.write("            <ul class=\"header-menu\">\r\n");
      out.write("                <li><a href=\"/\">줍깅 캠페인</a></li>\r\n");
      out.write("                <li><a href=\"/chellengeFrm.do?reqPage=1\">쓰담위크 퀘스트</a></li>\r\n");
      out.write("                <li><a href=\"/storyList.do?reqPage=1\">쓰담 스토리</a></li>\r\n");
      out.write("                <li><a href=\"javascript:void(0);\">쓰담 굿즈</a></li>\r\n");
      out.write("                <li><a href=\"/noticeList.do?reqPage=1\">쓰담 소식</a></li>\r\n");
      out.write("                <li><a href=\"/plogging.do\">진행중인 플로깅</a></li>\r\n");
      out.write("                ");
if(m!=null && m.getMemberLevel() == 1) {
      out.write("\r\n");
      out.write("                <li><a href=\"/admin.do\">관리자</a></li>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"util-menu\">\r\n");
      out.write("                ");
if(m!=null){
      out.write("\r\n");
      out.write("                <li><a href=\"/mypage.do\">");
      out.print(m.getNickname());
      out.write("</a></li>\r\n");
      out.write("                <li><a href=\"/logout.do\">로그아웃</a></li>\r\n");
      out.write("                ");
} else {
      out.write("\r\n");
      out.write("                <li><a href=\"/common/signinFrm.jsp\">로그인/회원가입</a></li>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("<!-- // header -->");
      out.write("\r\n");
      out.write("    <!-- content -->\r\n");
      out.write("    <div class=\"page-content\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"content-wrap flex\">\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"side-menu\">\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li class=\"active\"><a href=\"/admin.do\">메인</a></li>\r\n");
      out.write("        <li><a href=\"/adminUserList.do?reqPage=1\">회원관리</a></li>\r\n");
      out.write("        <li><a href=\"/adminDonation.do\">후원관리</a></li>\r\n");
      out.write("        <li><a href=\"/adminChallenge.do\">챌린지관리</a></li>\r\n");
      out.write("        <li><a href=\"\">크루관리</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("            <div class=\"content-container\">\r\n");
      out.write("                <div class=\"content-title\">\r\n");
      out.write("                    <h1>챌린지관리</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"content-body\" style=\"\">\r\n");
      out.write("                    <ul class=\"challenge-list\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <h5>김광섭님의 퀘스트 완료 신청</h5>\r\n");
      out.write("                            <dl><dt>신청일</dt><dd>2022.10.01</dd><dt>지역</dt><dd>서울</dd></dl>\r\n");
      out.write("                            <div class=\"collapse\" id=\"detail1\">\r\n");
      out.write("                                <div class=\"collapse-body\">\r\n");
      out.write("                                    <h6>인증샷</h6>\r\n");
      out.write("                                    <div class=\"challenge-img\">\r\n");
      out.write("                                        <img src=\"img/img-banner-donation.jpeg\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h6>신청품목</h6>\r\n");
      out.write("                                    <table class=\"tbl challenge-tbl\" width=\"300\">\r\n");
      out.write("                                        <colgroup>\r\n");
      out.write("                                            <col width=\"10%\">\r\n");
      out.write("                                        </colgroup>\r\n");
      out.write("                                        <thead>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>종류</th>\r\n");
      out.write("                                            <th>캔류</th>\r\n");
      out.write("                                            <th>유리류</th>\r\n");
      out.write("                                            <th>종이류</th>\r\n");
      out.write("                                            <th>페트류</th>\r\n");
      out.write("                                            <th>기타/일반</th>\r\n");
      out.write("                                            <th>비닐류</th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>개수</th>\r\n");
      out.write("                                            <td>2</td>\r\n");
      out.write("                                            <td>1</td>\r\n");
      out.write("                                            <td>0</td>\r\n");
      out.write("                                            <td>1</td>\r\n");
      out.write("                                            <td>1</td>\r\n");
      out.write("                                            <td>0</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>총점</th>\r\n");
      out.write("                                            <td>6</td>\r\n");
      out.write("                                            <td>3</td>\r\n");
      out.write("                                            <td>0</td>\r\n");
      out.write("                                            <td>2</td>\r\n");
      out.write("                                            <td>1</td>\r\n");
      out.write("                                            <td>0</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                    <div class=\"btn-group\">\r\n");
      out.write("                                        <button type=\"button\" class=\"btn bc2 f-bold\">승인</button>\r\n");
      out.write("                                        <button type=\"button\" class=\"btn bc6 f-bold\">거절</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <button type=\"button\" class=\"btn bc2\" data-toggle=\"collapse\" data-target=\"#detail1\">상세보기</button>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <h5>김광섭님의 퀘스트 완료 신청</h5>\r\n");
      out.write("                            <dl><dt>신청일</dt><dd>2022.10.01</dd><dt>지역</dt><dd>서울</dd></dl>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"collapse\" id=\"detail2\">\r\n");
      out.write("                                <div class=\"collapse-body\">\r\n");
      out.write("                                    <h6>인증샷</h6>\r\n");
      out.write("                                    <div class=\"challenge-img\">\r\n");
      out.write("                                        <img src=\"img/img-banner-donation.jpeg\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h6>신청품목</h6>\r\n");
      out.write("                                    <table class=\"tbl challenge-tbl\" width=\"300\">\r\n");
      out.write("                                        <colgroup>\r\n");
      out.write("                                            <col width=\"10%\">\r\n");
      out.write("                                        </colgroup>\r\n");
      out.write("                                        <thead>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>종류</th>\r\n");
      out.write("                                            <th>캔류</th>\r\n");
      out.write("                                            <th>유리류</th>\r\n");
      out.write("                                            <th>종이류</th>\r\n");
      out.write("                                            <th>페트류</th>\r\n");
      out.write("                                            <th>기타/일반</th>\r\n");
      out.write("                                            <th>비닐류</th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>개수</th>\r\n");
      out.write("                                            <td>2</td>\r\n");
      out.write("                                            <td>1</td>\r\n");
      out.write("                                            <td>0</td>\r\n");
      out.write("                                            <td>1</td>\r\n");
      out.write("                                            <td>1</td>\r\n");
      out.write("                                            <td>0</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>총점</th>\r\n");
      out.write("                                            <td>6</td>\r\n");
      out.write("                                            <td>3</td>\r\n");
      out.write("                                            <td>0</td>\r\n");
      out.write("                                            <td>2</td>\r\n");
      out.write("                                            <td>1</td>\r\n");
      out.write("                                            <td>0</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                    <div class=\"btn-group\">\r\n");
      out.write("                                        <button type=\"button\" class=\"btn bc2 f-bold\">승인</button>\r\n");
      out.write("                                        <button type=\"button\" class=\"btn bc6 f-bold\">거절</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <button type=\"button\" class=\"btn bc2\" data-toggle=\"collapse\" data-target=\"#detail2\">상세보기</button>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- // content -->\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!-- footer -->\r\n");
      out.write("<footer class=\"footer\">\r\n");
      out.write("    <div class=\"footer_wrap\">\r\n");
      out.write("        <div class=\"footer_text\">\r\n");
      out.write("            <p>재단법인 환경재단</p>\r\n");
      out.write("            <p>대표 진민호 대표전화 02-1111-1111 fax 02-111-1111</p>\r\n");
      out.write("            <p>문의 이메일 jinminho@kh.or.kr</p>\r\n");
      out.write("            <p>서울시 영등포구</p>\r\n");
      out.write("            <p>사업자 등록번호 111-11-11111</p>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"#\">이용약관</a></li>\r\n");
      out.write("                <li><a href=\"#\">개인정보처리방침</a></li> \r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("<!-- // footer -->");
      out.write("\r\n");
      out.write("    <script src=\"/js/sideMenu.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("        const collapseBtn = document.querySelectorAll(\"[data-toggle='collapse']\");\r\n");
      out.write("\r\n");
      out.write("        collapseBtn.forEach(function(item, index) {\r\n");
      out.write("            item.addEventListener(\"click\", function() {\r\n");
      out.write("\r\n");
      out.write("                const collapseTarget = document.querySelector(this.dataset.target);\r\n");
      out.write("                const collapseBody = collapseTarget.querySelector(\".collapse-body\");\r\n");
      out.write("                const bodyHeight = collapseBody.offsetHeight;\r\n");
      out.write("\r\n");
      out.write("                if(collapseTarget.classList.contains(\"active\")) {\r\n");
      out.write("                    this.innerText = \"상세보기\";\r\n");
      out.write("                    collapseTarget.classList.remove(\"active\");\r\n");
      out.write("                    collapseTarget.style.height = 0 +\"px\";\r\n");
      out.write("                } else {\r\n");
      out.write("                    this.innerText = \"간략히\";\r\n");
      out.write("                    collapseTarget.classList.add(\"active\");\r\n");
      out.write("                    collapseTarget.style.height = bodyHeight+\"px\";\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
