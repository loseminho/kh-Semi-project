/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-09-27 03:05:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.chellenge;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.earthpurging.member.model.vo.Member;

public final class quest3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
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
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	");

	Member member = (Member)session.getAttribute("m");
	
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>쓰담위크</title>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/quest3.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/reset.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(".stepBth{\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	font-family: DungGeunMo;\r\n");
      out.write("}\r\n");
      out.write(".button_su_inner{\r\n");
      out.write("  display: flex;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("} \r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"quick\">\r\n");
      out.write("    <a class=\"kakao_btn\" href=\"http://pf.kakao.com/_HxcUhb\" target=\"_blank\"><img src=\"/img/img/kakao.png\" alt=\"카카오톡\"></a>;\r\n");
      out.write("    <div class=\"top_btn1\"><a href=\"/\"><img src=\"/img/img/plog_logo.png\" class=\"plog_logo\"></a></div>\r\n");
      out.write("    <div class=\"top_btn\"><p>↑<br>TOP</p></div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"step\">\r\n");
      out.write("    <div class=\"sub_wrapper\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"top_title\">\r\n");
      out.write("        <div class=\"border2\">\r\n");
      out.write("          <div class=\"border3\">\r\n");
      out.write("            <div class=\"top\">\r\n");
      out.write("              <img src=\"/img/img/bumb_left.gif\" alt=\"폭탄\" class=\"bumb1\">\r\n");
      out.write("              <h5>STEP 02</h5>\r\n");
      out.write("              <img src=\"/img/img/bumb_right.gif\" alt=\"폭탄\" class=\"bumb2\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"bt\">\r\n");
      out.write("              <img src=\"/img/img/sub_title.png\" alt=\"쓰담기록\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- form -->\r\n");
      out.write("        <form id=\"inqForm\" name=\"inqForm\" method=\"post\" action=\"/quest4.do\" >\r\n");
      out.write("            <input type=\"hidden\" name=\"step\" value=\"2\">\r\n");
      out.write("           <input type=\"hidden\" name=\"memberNO\" value=\"");
      out.print(member.getMemberNo());
      out.write("\">\r\n");
      out.write("      <div class=\"form_wrap\">\r\n");
      out.write("        <div class=\"form_title\">\r\n");
      out.write("          힙한<span class=\"yellow\"><img src=\"/img/img/star.png\" alt=\"별\"></span>지구인의 정보\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--------------------------------------->\r\n");
      out.write("        <div class=\"form_box\">\r\n");
      out.write("          <div class=\"flag_title\">\r\n");
      out.write("            <p class=\"org\">이름</p>\r\n");
      out.write("            <p class=\"shadow\">이름</p>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"form_cont\">\r\n");
      out.write("            <input type=\"text\" id=\"p_name\" name=\"p_name\" class=\"input_grey h100\" placeholder=\"이름을 입력해 주세요.\" autocomplete=\"OFF\">\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--------------------------------------->\r\n");
      out.write("        <div class=\"form_box\">\r\n");
      out.write("          <div class=\"flag_title\">\r\n");
      out.write("            <p class=\"org\">연락처</p>\r\n");
      out.write("            <p class=\"shadow\">연락처</p>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"form_cont\">\r\n");
      out.write("            <input type=\"tel\" id=\"p_tel\" name=\"p_tel\"  onKeyup=\"this.value=this.value.replace(/[^-0-9]/g,'');\" class=\"input_grey h100\" placeholder=\"연락처를 입력해 주세요. 예시)010-1234-5678\" autocomplete=\"OFF\">\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--------------------------------------->\r\n");
      out.write("        <div class=\"form_box\">\r\n");
      out.write("          <div class=\"flag_title\">\r\n");
      out.write("            <p class=\"org\">이메일</p>\r\n");
      out.write("            <p class=\"shadow\">이메일</p>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"form_cont\">\r\n");
      out.write("            <input type=\"email\" id=\"p_email\" name=\"p_email\" class=\"input_grey h100\" placeholder=\"이메일을 입력해 주세요. 예시)hoo@naver.com\"  autocomplete=\"OFF\">\r\n");
      out.write("          </div>  \r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--------------------------------------->\r\n");
      out.write("        <div class=\"form_box address_box\">\r\n");
      out.write("          <div class=\"flex\">\r\n");
      out.write("            <div class=\"flex\">\r\n");
      out.write("              <div class=\"flag_title ft2\">\r\n");
      out.write("                <p class=\"org\">주소</p>\r\n");
      out.write("                <p class=\"shadow\">주소</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"fff\">(미입력시 보상 아이템을 전달할 수 없어요)</div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"form_cont\">\r\n");
      out.write("              <textarea  id=\"p_addr\" name=\"p_addr2\" type=\"text\" class=\"input_grey h100 mt40\" placeholder=\"주소를 입력해 주세요.\"></textarea>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--------------------------------------->\r\n");
      out.write("        <div class=\"person_chk\">\r\n");
      out.write("          <div class=\"flex flex1\">\r\n");
      out.write("            <label for=\"person_chk\" class=\"flag_title ft\">\r\n");
      out.write("              <p class=\"org\">개인정보 수집 및 이용 동의</p>\r\n");
      out.write("              <p class=\"shadow\">개인정보 수집 및 이용 동의</p>\r\n");
      out.write("            </label>\r\n");
      out.write("            <input type=\"checkbox\" class=\"check_box\" id=\"person_chk\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"person_detail\">자세히 보기</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--------------------------------------->\r\n");
      out.write("        <div class=\"form_bt\">\r\n");
      out.write("          <div class=\"button_su\">\r\n");
      out.write("            <span class=\"su_button_circle\"></span>\r\n");
      out.write("            <div id=\"endStep\" class=\"button_su_inner\">\r\n");
      out.write("              <button  type=\"submit\" class=\"button_text_container nextBtn stepBth\" >\r\n");
      out.write("                <span>쓰담기록<br>제출하기</span><span class=\"yellow\">▶</span>\r\n");
      out.write("              </button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--------------------------------------->\r\n");
      out.write("      </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- 개인정보 동의 팝업 -->\r\n");
      out.write("  <div class=\"popup_bg\"></div>\r\n");
      out.write("  <div class=\"popup personal_pop noto\">\r\n");
      out.write("    <div class=\"x_btn\"><span class=\"zwicon-close\">X</span></div>\r\n");
      out.write("    <div class=\"cont\">\r\n");
      out.write("      <환경재단>('https://ssudamweek.kr/'이하 '쓰담위크 퀘스트')는 「개인정보 보호법」 제30조에 따라 정보주체의 개인정보를 보호하고 이와 관련한 고충을 신속하고 원활하게 처리할 수 있도록 하기 위하여 다음과 같이 개인정보 처리방침을 수립·공개합니다. <br><br>\r\n");
      out.write("\r\n");
      out.write("      제1조(개인정보의 처리목적)<br>\r\n");
      out.write("      <환경재단>(이)가 개인정보 보호법 제32조에 따라 등록․공개하는 개인정보파일의 처리목적은 다음과 같습니다.<br>\r\n");
      out.write("        1. 개인정보 파일명 : 쓰담위크 퀘스트<br>\r\n");
      out.write("        개인정보의 처리목적 : 리워드발송<br>\r\n");
      out.write("        수집방법 : 홈페이지, 참여이벤트<br>\r\n");
      out.write("        보유근거 : 사용자의 개인정보처리방침 동의<br>\r\n");
      out.write("        보유기간 : 최대1개월(지체없이 파기)<br><br>\r\n");
      out.write("\r\n");
      out.write("        제2조(정보주체와 법정대리인의 권리·의무 및 그 행사방법)<br>\r\n");
      out.write("        ① 정보주체는 환경재단에 대해 언제든지 개인정보 열람·정정·삭제·처리정지 요구 등의 권리를 행사할 수 있습니다.<br>\r\n");
      out.write("        ② 제1항에 따른 권리 행사는환경재단에 대해 「개인정보 보호법」 시행령 제41조제1항에 따라 서면, 전자우편, 모사전송(FAX) 등을 통하여 하실 수 있으며 환경재단은(는) 이에 대해 지체 없이 조치하겠습니다.<br>\r\n");
      out.write("        ③ 제1항에 따른 권리 행사는 정보주체의 법정대리인이나 위임을 받은 자 등 대리인을 통하여 하실 수 있습니다.이 경우 “개인정보 처리 방법에 관한 고시(제2020-7호)” 별지 제11호 서식에 따른 위임장을 제출하셔야 합니다.<br>\r\n");
      out.write("        ④ 개인정보 열람 및 처리정지 요구는 「개인정보 보호법」 제35조 제4항, 제37조 제2항에 의하여 정보주체의 권리가 제한 될 수 있습니다.<br>\r\n");
      out.write("        ⑤ 개인정보의 정정 및 삭제 요구는 다른 법령에서 그 개인정보가 수집 대상으로 명시되어 있는 경우에는 그 삭제를 요구할 수 없습니다.<br>\r\n");
      out.write("        ⑥ 환경재단은(는) 정보주체 권리에 따른 열람의 요구, 정정·삭제의 요구, 처리정지의 요구 시 열람 등 요구를 한 자가 본인이거나 정당한 대리인인지를 확인합니다.<br><br>\r\n");
      out.write("\r\n");
      out.write("        제3조(처리하는 개인정보의 항목 작성)<br>\r\n");
      out.write("        ① <환경재단>은(는) 다음의 개인정보 항목을 처리하고 있습니다.<br>\r\n");
      out.write("          1. <쓰담서울 퀘스트><br>\r\n");
      out.write("            필수항목 : 이름, 연락처, 이메일<br>\r\n");
      out.write("            선택항목 : 주소<br><br>\r\n");
      out.write("\r\n");
      out.write("        제4조(개인정보의 파기)<br>\r\n");
      out.write("        ① <환경재단> 은(는) 개인정보 보유기간의 경과, 처리목적 달성 등 개인정보가 불필요하게 되었을 때에는 지체없이 해당 개인정보를 파기합니다.<br>\r\n");
      out.write("        ② 정보주체로부터 동의받은 개인정보 보유기간이 경과하거나 처리목적이 달성되었음에도 불구하고 다른 법령에 따라 개인정보를 계속 보존하여야 하는 경우에는, 해당 개인정보를 별도의 데이터베이스(DB)로 옮기거나 보관장소를 달리하여 보존합니다.<br>\r\n");
      out.write("        1. 법령 근거 : 개인정보보호법 시행령 제 16조<br>\r\n");
      out.write("        2. 보존하는 개인정보 항목 : 계좌정보, 거래날짜<br><br>\r\n");
      out.write("\r\n");
      out.write("        ③ 개인정보 파기의 절차 및 방법은 다음과 같습니다.<br>\r\n");
      out.write("        1. 파기절차<br>\r\n");
      out.write("        <환경재단> 은(는) 파기 사유가 발생한 개인정보를 선정하고, <환경재단> 의 개인정보 보호책임자의 승인을 받아 개인정보를 파기합니다.<br>\r\n");
      out.write("        2. 파기방법<br>\r\n");
      out.write("        전자적 파일 형태의 정보는 기록을 재생할 수 없는 기술적 방법을 사용합니다.<br><br>\r\n");
      out.write("\r\n");
      out.write("        제5조(개인정보의 안전성 확보 조치)<br>\r\n");
      out.write("        <환경재단> 은(는) 개인정보의 안전성 확보를 위해 다음과 같은 조치를 취하고 있습니다.\r\n");
      out.write("        1. 개인정보 취급 직원의 최소화 및 교육<br>\r\n");
      out.write("        개인정보를 취급하는 직원을 지정하고 담당자에 한정시켜 최소화 하여 개인정보를 관리하는 대책을 시행하고 있습니다.<br>\r\n");
      out.write("        2. 개인정보에 대한 접근 제한<br>\r\n");
      out.write("        개인정보를 처리하는 데이터베이스시스템에 대한 접근권한의 부여,변경,말소를 통하여 개인정보에 대한 접근통제를 위하여 필요한 조치를 하고 있으며 침입차단시스템을 이용하여 외부로부터의 무단 접근을 통제하고 있습니다.<br><br>\r\n");
      out.write("\r\n");
      out.write("        제6조(개인정보 자동 수집 장치의 설치•운영 및 거부에 관한 사항)<br>\r\n");
      out.write("        환경재단는 정보주체의 이용정보를 저장하고 수시로 불러오는 ‘쿠키(cookie)’를 사용하지 않습니다.<br><br>\r\n");
      out.write("\r\n");
      out.write("        제7조 (개인정보 보호책임자)<br>\r\n");
      out.write("        ① 환경재단은(는) 개인정보 처리에 관한 업무를 총괄해서 책임지고, 개인정보 처리와 관련한 정보주체의 불만처리 및 피해구제 등을 위하여 아래와 같이 개인정보 보호책임자를 지정하고\r\n");
      out.write("        있습니다.<br><br>\r\n");
      out.write("\r\n");
      out.write("        ▶ 개인정보 보호책임자<br>\r\n");
      out.write("        성명 :임지은<br>\r\n");
      out.write("        직책 :부장<br>\r\n");
      out.write("        직급 :부장<br>\r\n");
      out.write("        연락처 :02-2011-4394, 02-2011-4394, 02-2011-4394<br>\r\n");
      out.write("        ※ 개인정보 보호 담당부서로 연결됩니다.<br><br>\r\n");
      out.write("\r\n");
      out.write("        ▶ 개인정보 보호 담당부서<br>\r\n");
      out.write("        부서명 :그린커뮤니케이션<br>\r\n");
      out.write("        담당자 :임지은 부장<br>\r\n");
      out.write("        연락처 :02-2011-4394, 02-2011-4394 , 02-2011-4394<br>\r\n");
      out.write("        ② 정보주체께서는 환경재단 의 서비스(또는 사업)을 이용하시면서 발생한 모든 개인정보 보호 관련 문의, 불만처리, 피해구제 등에 관한 사항을 개인정보 보호책임자 및 담당부서로\r\n");
      out.write("        문의하실 수 있습니다. 환경재단 은(는) 정보주체의 문의에 대해 지체 없이 답변 및 처리해드릴 것입니다.<br><br>\r\n");
      out.write("\r\n");
      out.write("        제8조(개인정보 열람청구)<br>\r\n");
      out.write("        정보주체는 ｢개인정보 보호법｣ 제35조에 따른 개인정보의 열람 청구를 아래의 부서에 할 수 있습니다.<br>\r\n");
      out.write("        <환경재단>은(는) 정보주체의 개인정보 열람청구가 신속하게 처리되도록 노력하겠습니다.<br><br>\r\n");
      out.write("\r\n");
      out.write("        ▶ 개인정보 열람청구 접수·처리 부서<br>\r\n");
      out.write("        부서명 : 그린커뮤니케이션<br>\r\n");
      out.write("        담당자 : 임지은 부장<br>\r\n");
      out.write("        연락처 : 02-2011-4394, 02-2011-4394 , 02-2011-4394<br><br>\r\n");
      out.write("\r\n");
      out.write("        제9조(권익침해 구제방법)<br>\r\n");
      out.write("        정보주체는 개인정보침해로 인한 구제를 받기 위하여 개인정보분쟁조정위원회, 한국인터넷진흥원 개인정보침해신고센터 등에 분쟁해결이나 상담 등을 신청할 수 있습니다. 이 밖에 기타 개인정보침해의 신고, 상담에 대하여는 아래의 기관에 문의하시기 바랍니다.<br>\r\n");
      out.write("        1. 개인정보분쟁조정위원회 : (국번없이) 1833-6972 (www.kopico.go.kr)<br>\r\n");
      out.write("        2. 개인정보침해신고센터 : (국번없이) 118 (privacy.kisa.or.kr)<br>\r\n");
      out.write("        3. 대검찰청 : (국번없이) 1301 (www.spo.go.kr)<br>\r\n");
      out.write("        4. 경찰청 : (국번없이) 182 (cyberbureau.police.go.kr)<br><br>\r\n");
      out.write("\r\n");
      out.write("        「개인정보보호법」제35조(개인정보의 열람), 제36조(개인정보의 정정·삭제), 제37조(개인정보의 처리정지 등)의 규정에 의한 요구에 대 하여 공공기관의 장이 행한 처분 또는\r\n");
      out.write("        부작위로 인하여 권리 또는 이익의 침해를 받은 자는 행정심판법이 정하는 바에 따라 행정심판을 청구할 수 있습니다.<br>\r\n");
      out.write("        ※ 행정심판에 대해 자세한 사항은 중앙행정심판위원회(www.simpan.go.kr) 홈페이지를 참고하시기 바랍니다.<br><br>\r\n");
      out.write("\r\n");
      out.write("        제10조(개인정보 처리방침 변경)<br>\r\n");
      out.write("        ① 이 개인정보처리방침은 2021년 4월 1부터 적용됩니다.\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("<footer class=\"noto\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"top\">\r\n");
      out.write("    <div class=\"borderR borderL\">\r\n");
      out.write("      <p class=\"txt\">재단법인 환경재단</p>\r\n");
      out.write("      <p class=\"line\"></p>\r\n");
      out.write("      <p class=\"txt\">최열</p>\r\n");
      out.write("      <p class=\"line\"></p>\r\n");
      out.write("      <p class=\"txt\">101-82-09896</p>\r\n");
      out.write("      <p class=\"line mo_none\"></p>\r\n");
      out.write("      <p class=\"txt mo_b\">서울시 중구 을지로 16 백남빌딩 7F 환경재단</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"borderR\">\r\n");
      out.write("      <p class=\"txt\">greencsr@greenfund.org</p>\r\n");
      out.write("      <p class=\"line mo_none\"></p>\r\n");
      out.write("      <p class=\"txt mo_b\">고객센터 <span class=\"mo_none\">전화번호</span> 02-2011-4300</p>\r\n");
      out.write("      <p class=\"line mo_none\"></p>\r\n");
      out.write("      <p class=\"txt mo_b\"><span class=\"mo_none\">고객센터 </span>팩스번호 02-725-4840</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"copy\">Copyright ⓒ 쓰담위크 All rights reserved.</div>\r\n");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("<script src=\"/js/quest3.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
