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
    <%-- KANBAN BASE INCLUDES --%>
    <%@ include file="/WEB-INF/jsp/components/kanban_base_includes_head.html" %>

</head>
<body style="background-color: #4d4d4d">
<!-- begin #page-loader -->
<div id="page-loader" class="fade in"><span class="spinner"></span></div>
<!-- end #page-loader -->

<!-- begin #page-container -->
<div id="page-container" class="fade page-without-sidebar page-header-fixed">
    <%-- HEADER  --%>
    <%@ include file="/WEB-INF/jsp/components/header.jsp" %>
    <div style="height: 3.5vh"></div>
    <%-- KANBAN BEGIN --%>
    <%@ include file="/WEB-INF/jsp/components/kanban_base.jsp" %>
    <%-- KANBAN END --%>
    <br><br>

    <!-- begin scroll to top btn -->
    <a href="javascript:;" class="btn btn-icon btn-circle btn-primary btn-scroll-to-top fade" data-click="scroll-top"><i class="fa fa-angle-up"></i></a>
    <!-- end scroll to top btn -->
</div>
<!-- end page container -->

<%-- HEADER INCLUDES --%>
<%@ include file="/WEB-INF/jsp/components/header_includes_body_bottom.html" %>

<%-- KANBAN BASE INCLUDES --%>
<%@ include file="/WEB-INF/jsp/components/kanban_base_includes_body_bottom.html" %>

</body>

<!-- Mirrored from seantheme.com/color-admin-v3.0/admin/apple/page_without_sidebar.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 22 Feb 2018 13:03:33 GMT -->
</html>
