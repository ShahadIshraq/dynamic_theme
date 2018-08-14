<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->

<!-- Mirrored from seantheme.com/color-admin-v3.0/admin/apple/page_without_sidebar.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 22 Feb 2018 13:03:33 GMT -->
<head>
    <meta charset="utf-8" />
    <title>Kanban Board</title>
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
    <meta content="" name="description" />
    <meta content="" name="Shahad Ishraq" />

    <%--HEADER INCLUDES --%>
    <%@ include file="/WEB-INF/jsp/components/header_includes_head.html" %>
    <%-- Includes for Kanban Base --%>
    <%@ include file="/WEB-INF/jsp/components/kanban_base_includes_head.html"%>
    <%-- Page level includes  --%>
    <script src="/assets/jquery/jquery-3.3.1.js"></script>

</head>
<body id="page_base_container" style="background-color: #4d4d4d">
<!-- begin #page-loader -->
<div id="page-loader" class="fade in"><span class="spinner"></span></div>
<!-- end #page-loader -->

<!-- begin #page-container -->
<div id="page-container" class="fade page-without-sidebar page-header-fixed">
    <%-- HEADER  --%>
    <%@ include file="/WEB-INF/jsp/components/header.jsp" %>
    <br><br>

        <%@ include file="/WEB-INF/jsp/components/kanban_base.jsp" %>

    <br><br>

        <%--<%@ include file="/WEB-INF/jsp/theme/theme_panel.html" %>--%>
        <%@ include file="/WEB-INF/jsp/theme/theme_modal.html" %>
    <!-- begin scroll to top btn -->
    <a href="javascript:;" class="btn btn-icon btn-circle btn-primary btn-scroll-to-top fade" data-click="scroll-top"><i class="fa fa-angle-up"></i></a>
    <!-- end scroll to top btn -->
    <!-- begin #footer -->
    <div class="footer_container" id="footer_container" style="text-align: center; background-color: #333333; color: white">
        &copy; 2018 Reve Systems, All Rights Reserved
    </div>
    <!-- end #footer -->
</div>
<!-- end page container -->

<%-- HEADER INCLUDES --%>
<%@ include file="/WEB-INF/jsp/components/header_includes_body_bottom.html" %>

<%-- Page level script --%>

<%-- Includes for Kanban Base --%>
<%@ include file="/WEB-INF/jsp/components/kanban_base_includes_body_bottom.jsp"%>


</body>

</html>
