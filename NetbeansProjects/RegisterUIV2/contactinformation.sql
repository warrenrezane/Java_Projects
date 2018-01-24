-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 24, 2018 at 02:04 AM
-- Server version: 5.7.15-log
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `testdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `contactinformation`
--

CREATE TABLE `contactinformation` (
  `ID` int(11) NOT NULL,
  `Date_Registered` datetime DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `ChurchName` varchar(100) DEFAULT NULL,
  `ChurchPos` varchar(20) DEFAULT NULL,
  `ChurchAddress` varchar(100) DEFAULT NULL,
  `District` varchar(100) DEFAULT NULL,
  `EmailAddress` varchar(50) DEFAULT NULL,
  `ContactNumber` varchar(30) DEFAULT NULL,
  `PastorName` varchar(50) DEFAULT NULL,
  `PastorContact` varchar(30) DEFAULT NULL,
  `CampsAttended` varchar(30) DEFAULT NULL,
  `Allergies` varchar(100) DEFAULT NULL,
  `CamperGroup` int(11) DEFAULT NULL,
  `BSLeader` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `contactinformation`
--

INSERT INTO `contactinformation` (`ID`, `Date_Registered`, `Name`, `Age`, `Gender`, `ChurchName`, `ChurchPos`, `ChurchAddress`, `District`, `EmailAddress`, `ContactNumber`, `PastorName`, `PastorContact`, `CampsAttended`, `Allergies`, `CamperGroup`, `BSLeader`) VALUES
(1, '2018-01-20 05:13:41', 'Rezane, Warren D.', 19, 'Male', 'IBCP Center Church', 'Member/Staff', 'Davao City', 'Davao City', 'warrenskater1@gmail.com', '09396495631', '', '', '0', 'Chicken ', NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `contactinformation`
--
ALTER TABLE `contactinformation`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `contactinformation`
--
ALTER TABLE `contactinformation`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
