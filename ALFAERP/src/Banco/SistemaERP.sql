-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: sistemaerp
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idCliente` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(30) NOT NULL,
  `CPF` char(20) NOT NULL,
  `Rua` varchar(30) NOT NULL,
  `Bairro` varchar(30) NOT NULL,
  `Numero` varchar(5) NOT NULL,
  `CEP` varchar(10) NOT NULL,
  `Cidade` varchar(30) NOT NULL,
  `Estado` char(2) NOT NULL,
  `Telefone` varchar(20) NOT NULL,
  `Telefone2` varchar(20) DEFAULT NULL,
  `Email` varchar(30) NOT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'José','077.128.905-15','Vicente da Costa','Planalto','44','62327-065','Tianguá','CE','9999-9999','5555-5555','josemendez27@gmail.com'),(2,'Marcelo','303.455.883-44','12 de Agosto','Planalto','28','62320-000','Tianguá','CE','4444-4444',NULL,'q33marcelo@gmail.com'),(3,'Alessandra','123.338.957-35','12 de Agosto','Planalto','12','62388-085','Tianguá','CE','2222-2222','1111-1111','alesilva.contato2022@gmail.com');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fornecedor`
--

DROP TABLE IF EXISTS `fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedor` (
  `idFornecedor` int NOT NULL AUTO_INCREMENT,
  `NomeFornecedor` varchar(30) NOT NULL,
  `CNPJ` char(20) NOT NULL,
  `Rua` varchar(30) NOT NULL,
  `Bairro` varchar(30) NOT NULL,
  `Numero` varchar(5) NOT NULL,
  `CEP` varchar(10) NOT NULL,
  `Cidade` varchar(30) NOT NULL,
  `Estado` char(2) NOT NULL,
  `Telefone` char(20) NOT NULL,
  `Telefone2` char(20) DEFAULT NULL,
  `Email` varchar(30) NOT NULL,
  PRIMARY KEY (`idFornecedor`),
  KEY `NomeFornecedor_idx` (`NomeFornecedor`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedor`
--

LOCK TABLES `fornecedor` WRITE;
/*!40000 ALTER TABLE `fornecedor` DISABLE KEYS */;
INSERT INTO `fornecedor` VALUES (10,'Casas Bahia','25.583.657/0001-50','12 de Agosto','Planalto','2','62333-066','Tianguá','CE','0001-0001','0002-0002','casasbahia@gmail.com'),(28,'Embraer','15.643.636/0001-29','Av. Brigadeiro Faria Lima','Centro','196','0983-110','Sao Paulo','SP','0033-2284',NULL,'embraer@gmail.com'),(77,'Fornecedora Agro ','27.576.348/0001-88','Cajalzeiras','Rodoviaria','55','5622-099','Fortaleza','CE','9956-5691','9987-7773','cajal2022@gmail.com');
/*!40000 ALTER TABLE `fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario` (
  `idFuncionario` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(30) NOT NULL,
  `CPF` varchar(25) NOT NULL,
  `RG` varchar(25) NOT NULL,
  `DtAdmissao` date NOT NULL,
  `Rua` varchar(30) NOT NULL,
  `Bairro` varchar(30) NOT NULL,
  `Numero` varchar(5) NOT NULL,
  `CEP` varchar(10) NOT NULL,
  `Cidade` varchar(30) NOT NULL,
  `Estado` char(2) NOT NULL,
  `Cargo` varchar(20) NOT NULL,
  `Telefone` char(20) NOT NULL,
  `Telefone2` char(20) DEFAULT NULL,
  `DtDemissao` date DEFAULT NULL,
  `Login`  varchar(20) DEFAULT NULL,
  `Senha`  varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idFuncionario`)
) ENGINE=InnoDB AUTO_INCREMENT=835 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (255,'Larissa','393.995.229-21','45.305.324-5','676.50620.37-3','2021-07-10','Av. Prefeito Jaques Nunes','Centro','59','62320-000','Tianguá','CE','Adminstracao','0033-0096','9485-9944','2021-04-27'),(293,'Carlos','345.336.668-02','16.474.851-9','057.56379.80-7','2021-10-15','Av. Moises Moita','Centro','103','65669-003','Tianguá','CE','Gerente','0055-0055','9229-5599','2022-05-10'),(834,'Luis Alberto','227.559.873-11','11.287.374-1','070.99228.54-5','2021-08-10','Dep. Manuel Franscisco','Centro','17','76238-011','Tianguá','CE','Atendente','0077-0087','9339-8886','2022-09-25');
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `idProduto` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(30) NOT NULL,
  `Descricao` varchar(30) NOT NULL,
  `PrecoUntCompra` double NOT NULL,
  `PrecoUntVenda` double NOT NULL,
  `NomeFornecedor` varchar(30) NOT NULL,
  `DtFabricacao` date NOT NULL,
  `DtValidade` date NOT NULL,
  PRIMARY KEY (`idProduto`),
  KEY `FornecedorProduto_idx` (`NomeFornecedor`)
) ENGINE=InnoDB AUTO_INCREMENT=90 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (55,'Bicicleta','Locomocao',250,221,'AMX','2022-08-10','2031-08-10'),(67,'Leite','Alimenticio',10,9,'Parmalat','2021-08-10','2021-09-10'),(89,'Queijo','Alimenticio',2,1,'Itatiaia','2018-05-10','2018-06-10');
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venda` (
  `idVenda` int NOT NULL AUTO_INCREMENT,
  `idProduto` int NOT NULL,
  `idCliente` int NOT NULL,
  `PrecoUntVenda` double NOT NULL, /* mudar para PreçoUntVenda */
  `Quantidade` varchar(10) NOT NULL,
  `Preco` double,
  `Tipopagamento` varchar(30) NOT NULL,
  `Desc` double,
  PRIMARY KEY (`idVenda`),
  KEY `VendaProduto_idx` (`idProduto`),
  KEY `VendaCliente_idx` (`idCliente`),
  KEY `VendaUnt_idx` (`PrecoUntVenda`),
  CONSTRAINT `VendaCliente` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`),
  CONSTRAINT `VendaProduto` FOREIGN KEY (`idProduto`) REFERENCES `produto` (`idProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-21 14:18:11
