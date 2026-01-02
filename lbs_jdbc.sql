-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 02, 2026 at 12:01 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lbs_jdbc`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `Book_Code` int(11) NOT NULL,
  `Title` varchar(255) DEFAULT NULL,
  `Author` varchar(255) DEFAULT NULL,
  `Genre` varchar(255) DEFAULT NULL,
  `Availability` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`Book_Code`, `Title`, `Author`, `Genre`, `Availability`) VALUES
(283001, 'To kill a MOCKINGBIRD', 'Harper Lee', 'Fiction/Classic', 7),
(283002, '1984', ' George Orwell', 'Dystopian', 5),
(283003, 'The Great Gatsby', 'F. Scott Fitzgerald', 'Classic', 3),
(283004, 'Pride and Prejudice', 'Jane Austen', 'Romance', 5),
(283005, 'The Catcher in the Rye', ' J.D. Salinger', 'Coming-of-Age ', 7),
(283006, 'The Hobbit', 'J.R.R. Tolkien', 'Fantasy', 8),
(283007, 'Harry Potter and the Sorcerer’s Stone', 'J.K. Rowling', 'Fantasy', 4),
(283008, 'The Hunger Games', 'Suzanne Collins', 'Dystopian', 6),
(283009, 'The Fault in Our Stars', 'John Green', 'YA Romance', 1),
(283010, 'The Book Thief', 'Markus Zusak', 'Historical Fiction', 10),
(283011, 'The Alchemist', 'Paulo Coelho', 'Philosophical Fiction', 5),
(283012, 'The Da Vinci Code', 'Dan Brown', 'Mystery / Thriller', 3),
(283013, 'The Maze Runner', 'James Dashner', 'YA Dystopian', 7),
(283014, ' The Girl on the Train', 'Paula Hawkins', 'Psychological Thriller', 2),
(283015, 'A Game of Thrones', 'George R.R. Martin', 'Fantasy', 3),
(283016, 'The Perks of Being a Wallflower', 'Stephen Chbosky', 'YA', 2),
(283017, 'The Lightning Thief', 'Rick Riordan', 'Fantasy', 3),
(283018, 'The Outsiders', 'S.E. Hinton', 'YA Fiction', 2),
(283019, 'The Kite Runner', 'Khaled Hosseini', 'Drama', 3),
(283020, 'The Little Prince', 'Antoine de Saint-Exupéry', 'Children’s / Classic', 4);

-- --------------------------------------------------------

--
-- Table structure for table `registertable`
--

CREATE TABLE `registertable` (
  `StudentID` int(11) NOT NULL,
  `StudentName` varchar(75) DEFAULT NULL,
  `Contact_Number` varchar(15) DEFAULT NULL,
  `Course_Year` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `registertable`
--

INSERT INTO `registertable` (`StudentID`, `StudentName`, `Contact_Number`, `Course_Year`) VALUES
(1, 'Chan Chan', '1234567890', 'BSIT2');

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `Student_ID` int(11) DEFAULT NULL,
  `Book_Code` int(11) DEFAULT NULL,
  `Course_YR` varchar(10) DEFAULT NULL,
  `BorrowedTime` int(11) DEFAULT NULL,
  `ReturnTime` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`Book_Code`);

--
-- Indexes for table `registertable`
--
ALTER TABLE `registertable`
  ADD PRIMARY KEY (`StudentID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
