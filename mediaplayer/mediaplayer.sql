-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Apr 03, 2024 alle 14:05
-- Versione del server: 10.4.27-MariaDB
-- Versione PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mediaplayer`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `film`
--

CREATE TABLE `film` (
  `id_film` int(11) NOT NULL,
  `titolo` varchar(100) NOT NULL,
  `copertina` text NOT NULL,
  `descrizione` text DEFAULT NULL,
  `durata` time DEFAULT NULL,
  `data_produzione` date DEFAULT NULL,
  `paese_produzione` varchar(100) DEFAULT NULL,
  `id_regista` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `film`
--

INSERT INTO `film` (`id_film`, `titolo`, `copertina`, `descrizione`, `durata`, `data_produzione`, `paese_produzione`, `id_regista`) VALUES
(1, 'mao', 'pepepepepepep', 'maopao', '14:04:24', '2024-04-03', 'zulu', 1);

-- --------------------------------------------------------

--
-- Struttura della tabella `regista`
--

CREATE TABLE `regista` (
  `id_regista` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `cognome` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `regista`
--

INSERT INTO `regista` (`id_regista`, `nome`, `cognome`) VALUES
(1, 'damiano', 'gobbo');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`id_film`),
  ADD KEY `produzione` (`id_regista`);

--
-- Indici per le tabelle `regista`
--
ALTER TABLE `regista`
  ADD PRIMARY KEY (`id_regista`);

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `film`
--
ALTER TABLE `film`
  ADD CONSTRAINT `produzione` FOREIGN KEY (`id_regista`) REFERENCES `regista` (`id_regista`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
