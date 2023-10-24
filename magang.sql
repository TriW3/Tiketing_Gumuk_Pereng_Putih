-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 24, 2023 at 03:33 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `magang`
--

-- --------------------------------------------------------

--
-- Table structure for table `keperluan`
--

CREATE TABLE `keperluan` (
  `Kode_Kegiatan` int(5) NOT NULL,
  `Kegiatan` varchar(25) NOT NULL,
  `Fasilitas` varchar(30) NOT NULL,
  `HTM` int(15) NOT NULL,
  `HTMF` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `keperluan`
--

INSERT INTO `keperluan` (`Kode_Kegiatan`, `Kegiatan`, `Fasilitas`, `HTM`, `HTMF`) VALUES
(1, 'Kemah', '-', 5000, 0),
(2, 'wisata', '-', 10000, 0),
(3, 'kemah + tenda', 'Tenda', 5000, 35000),
(4, 'kemah + liliput', 'Rumah Liliput', 5000, 75000),
(5, 'wisata + liliput', 'Rumah Liliput', 10000, 75000);

-- --------------------------------------------------------

--
-- Table structure for table `konsumen`
--

CREATE TABLE `konsumen` (
  `Kode` int(5) NOT NULL,
  `Nama` varchar(25) NOT NULL,
  `Kota` varchar(30) NOT NULL,
  `No Hp` varchar(13) NOT NULL,
  `Instansi` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `konsumen`
--

INSERT INTO `konsumen` (`Kode`, `Nama`, `Kota`, `No Hp`, `Instansi`) VALUES
(4, 'rudi', 'semarang', '089787666353', 'sekolah'),
(9, 'Siti', 'palembang', '0897777733', 'Sekolah'),
(77, 'dedi', 'ambarawa', '78763627281', 'seklah');

-- --------------------------------------------------------

--
-- Table structure for table `temporari`
--

CREATE TABLE `temporari` (
  `Kode_Kegiatan` int(8) NOT NULL,
  `Kegiatan` varchar(25) NOT NULL,
  `Harga` varchar(25) NOT NULL,
  `Satuan` varchar(13) NOT NULL,
  `Jumlah` int(25) NOT NULL,
  `Total` int(25) NOT NULL,
  `noFak` int(25) NOT NULL,
  `Kode_P` int(25) NOT NULL,
  `Nama_P` varchar(25) NOT NULL,
  `Alamat` varchar(35) NOT NULL,
  `Kota` varchar(25) NOT NULL,
  `Discon` varchar(25) NOT NULL,
  `Tanggal` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `temporari`
--

INSERT INTO `temporari` (`Kode_Kegiatan`, `Kegiatan`, `Harga`, `Satuan`, `Jumlah`, `Total`, `noFak`, `Kode_P`, `Nama_P`, `Alamat`, `Kota`, `Discon`, `Tanggal`) VALUES
(5, 'wisata + liliput', 'Rumah Liliput', '2', 10000, 75000, 95000, 77, 'dedi', '78763627281', 'seklah', '', '2022-03-05');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `keperluan`
--
ALTER TABLE `keperluan`
  ADD PRIMARY KEY (`Kode_Kegiatan`);

--
-- Indexes for table `konsumen`
--
ALTER TABLE `konsumen`
  ADD PRIMARY KEY (`Kode`);

--
-- Indexes for table `temporari`
--
ALTER TABLE `temporari`
  ADD PRIMARY KEY (`Kode_Kegiatan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
