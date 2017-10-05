-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 05-Out-2017 às 02:04
-- Versão do servidor: 10.1.26-MariaDB
-- PHP Version: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `empresa`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `gerente`
--

CREATE TABLE `gerente` (
  `id_gerente` int(11) NOT NULL,
  `nome` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `gerente`
--

INSERT INTO `gerente` (`id_gerente`, `nome`) VALUES
(2, ''),
(3, ''),
(4, 'Matheus'),
(5, 'teste Ian');

-- --------------------------------------------------------

--
-- Estrutura da tabela `local`
--

CREATE TABLE `local` (
  `id_local` int(11) NOT NULL,
  `nome` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `local`
--

INSERT INTO `local` (`id_local`, `nome`) VALUES
(2, ''),
(3, 'Guarajuba');

-- --------------------------------------------------------

--
-- Estrutura da tabela `projeto`
--

CREATE TABLE `projeto` (
  `id_projeto` int(11) NOT NULL,
  `nome` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `projeto`
--

INSERT INTO `projeto` (`id_projeto`, `nome`) VALUES
(1, ''),
(2, ''),
(4, ''),
(5, '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `relacionamento_glp`
--

CREATE TABLE `relacionamento_glp` (
  `id_gerente` int(11) NOT NULL,
  `id_local` int(11) NOT NULL,
  `id_projeto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `relacionamento_glp`
--

INSERT INTO `relacionamento_glp` (`id_gerente`, `id_local`, `id_projeto`) VALUES
(2, 2, 2),
(4, 3, 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gerente`
--
ALTER TABLE `gerente`
  ADD PRIMARY KEY (`id_gerente`);

--
-- Indexes for table `local`
--
ALTER TABLE `local`
  ADD PRIMARY KEY (`id_local`);

--
-- Indexes for table `projeto`
--
ALTER TABLE `projeto`
  ADD PRIMARY KEY (`id_projeto`);

--
-- Indexes for table `relacionamento_glp`
--
ALTER TABLE `relacionamento_glp`
  ADD PRIMARY KEY (`id_gerente`,`id_local`),
  ADD KEY `id_localfk` (`id_local`),
  ADD KEY `id_projetofk` (`id_projeto`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `gerente`
--
ALTER TABLE `gerente`
  MODIFY `id_gerente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `local`
--
ALTER TABLE `local`
  MODIFY `id_local` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `projeto`
--
ALTER TABLE `projeto`
  MODIFY `id_projeto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `relacionamento_glp`
--
ALTER TABLE `relacionamento_glp`
  ADD CONSTRAINT `id_gerentefk` FOREIGN KEY (`id_gerente`) REFERENCES `gerente` (`id_gerente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_localfk` FOREIGN KEY (`id_local`) REFERENCES `local` (`id_local`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_projetofk` FOREIGN KEY (`id_projeto`) REFERENCES `projeto` (`id_projeto`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
