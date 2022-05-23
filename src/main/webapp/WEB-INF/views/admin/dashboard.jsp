<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>AdminLTE 3 | Dashboard</title>

<!-- Google Font: Source Sans Pro -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="/resources/admin/plugins/fontawesome-free/css/all.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- Tempusdominus Bootstrap 4 -->
<link rel="stylesheet"
	href="/resources/admin/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
<!-- iCheck -->
<link rel="stylesheet"
	href="/resources/admin/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
<!-- JQVMap -->
<link rel="stylesheet"
	href="/resources/admin/plugins/jqvmap/jqvmap.min.css">
<!-- Theme style -->
<link rel="stylesheet"
	href="/resources/admin/dist//css/adminlte.min.css">
<!-- overlayScrollbars -->
<link rel="stylesheet"
	href="/resources/admin/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
<!-- Daterange picker -->
<link rel="stylesheet"
	href="/resources/admin/plugins/daterangepicker/daterangepicker.css">
<!-- summernote -->
<link rel="stylesheet"
	href="/resources/admin/plugins/summernote/summernote-bs4.min.css">
</head>
<body class="hold-transition sidebar-mini layout-fixed">
	<div class="wrapper">

		<!-- Preloader -->
		<div
			class="preloader flex-column justify-content-center align-items-center">
			<img class="animation__shake"
				src="/resources/admin/dist//img/AdminLTELogo.png" alt="AdminLTELogo"
				height="60" width="60">
		</div>

		<!-- Navbar -->
		<jsp:include page="navbar/admin-nav.jsp" />

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<div class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1 class="m-0">Dashboard</h1>
						</div>
						<!-- /.col -->
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="#">Home</a></li>
								<li class="breadcrumb-item active">Dashboard v1</li>
							</ol>
						</div>
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</div>
				<!-- /.container-fluid -->
			</div>
			<!-- /.content-header -->

			<!-- Main content -->
			<section class="content">
				<div class="container-fluid">
					<!-- Small boxes (Stat box) -->
					<div class="row">
						<div class="col-lg-3 col-6">
							<!-- small box -->
							<div class="small-box bg-info">
								<div class="inner">
									<h3>
										${todayBoardCnt }<sup style="font-size : 20px">개</sup>
									</h3>

									<p>당일 게시물 등록 수</p>
								</div>
								<div class="icon">
									<i class="ion ion-bag"></i>
								</div>
							</div>
						</div>
						<!-- ./col -->
						<div class="col-lg-3 col-6">
							<!-- small box -->
							<div class="small-box bg-success">
								<div class="inner">
									<h3>
										${todayBoardCnt }<sup style="font-size: 20px">개</sup>
									</h3>

									<p>당일 게시물 등록 수</p>
								</div>
								<div class="icon">
									<i class="ion ion-stats-bars"></i>
								</div>
							</div>
						</div>
						<!-- ./col -->
						<div class="col-lg-3 col-6">
							<!-- small box -->
							<div class="small-box bg-warning">
								<div class="inner">
									<h3>44</h3>

									<p>총 방문자 수</p>
								</div>
								<div class="icon">
									<i class="ion ion-person-add"></i>
								</div>
							</div>
						</div>
						<!-- ./col -->
						<div class="col-lg-3 col-6">
							<!-- small box -->
							<div class="small-box bg-danger">
								<div class="inner">
									<h3>65</h3>

									<p>당일 방문자 수</p>
								</div>
								<div class="icon">
									<i class="ion ion-pie-graph"></i>
								</div>
							</div>
						</div>
						<!-- ./col -->
					</div>
					<!-- /.row -->
					<!-- Main row -->
					<section class="content">
						<div class="col-md-12">
							<div class="row">

								<!-- AREA CHART -->
								<div class="col-md-6">
									<div class="card card-primary">
										<div class="card-header">
											<h3 class="card-title">Area Chart</h3>

											<div class="card-tools">
												<button type="button" class="btn btn-tool"
													data-card-widget="collapse">
													<i class="fas fa-minus"></i>
												</button>
												<button type="button" class="btn btn-tool"
													data-card-widget="remove">
													<i class="fas fa-times"></i>
												</button>
											</div>
										</div>
										<div class="card-body">
											<div class="chart">
												<canvas id="areaChart"
													style="min-height: 250px; height: 250px; max-height: 250px; max-width: 100%;"></canvas>
											</div>
										</div>
										<!-- /.card-body -->
									</div>
								</div>
								<!-- /.card -->

								<!-- DONUT CHART -->
								<div class="col-md-6">
									<div class="card card-danger">
										<div class="card-header">
											<h3 class="card-title">Donut Chart</h3>

											<div class="card-tools">
												<button type="button" class="btn btn-tool"
													data-card-widget="collapse">
													<i class="fas fa-minus"></i>
												</button>
												<button type="button" class="btn btn-tool"
													data-card-widget="remove">
													<i class="fas fa-times"></i>
												</button>
											</div>
										</div>
										<div class="card-body">
											<canvas id="donutChart"
												style="min-height: 250px; height: 250px; max-height: 250px; max-width: 100%;"></canvas>
										</div>
										<!-- /.card-body -->
									</div>
								</div>
							</div>
							<!-- /.card -->

							<!-- PIE CHART -->
							<div class="row">
								<div class="col-md-6">
									<div class="card card-danger">
										<div class="card-header">
											<h3 class="card-title">Pie Chart</h3>

											<div class="card-tools">
												<button type="button" class="btn btn-tool"
													data-card-widget="collapse">
													<i class="fas fa-minus"></i>
												</button>
												<button type="button" class="btn btn-tool"
													data-card-widget="remove">
													<i class="fas fa-times"></i>
												</button>
											</div>
										</div>
										<div class="card-body">
											<canvas id="pieChart"
												style="min-height: 250px; height: 250px; max-height: 250px; max-width: 100%;"></canvas>
										</div>
										<!-- /.card-body -->
									</div>
								</div>
								<!-- /.card -->

								<!-- /.col (LEFT) -->

								<!-- /.card -->

								<!-- BAR CHART -->
								<div class="col-md-6">
									<div class="card card-success">
										<div class="card-header">
											<h3 class="card-title">Bar Chart</h3>

											<div class="card-tools">
												<button type="button" class="btn btn-tool"
													data-card-widget="collapse">
													<i class="fas fa-minus"></i>
												</button>
												<button type="button" class="btn btn-tool"
													data-card-widget="remove">
													<i class="fas fa-times"></i>
												</button>
											</div>
										</div>
										<div class="card-body">
											<div class="chart">
												<canvas id="barChart"
													style="min-height: 250px; height: 250px; max-height: 250px; max-width: 100%;"></canvas>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</section>
				</div>
			</section>
		</div>

		<!-- /.content-wrapper -->
		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Control sidebar content goes here -->
		</aside>
		<!-- /.control-sidebar -->
	</div>
	<!-- ./wrapper -->

	<!-- jQuery -->
<script src="/resources/admin/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="/resources/admin/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- ChartJS -->
<script src="/resources/admin/plugins/chart.js/Chart.min.js"></script>
<!-- AdminLTE App -->
<script src="/resources/admin/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
	<!-- AdminLTE for demo purposes -->
</body>
</html>
