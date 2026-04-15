# 🚀 Java WAR Deployment with Jenkins, Tomcat & Nexus (CI/CD)

## 📌 Project Overview

This project demonstrates a complete **CI/CD pipeline** for building, packaging, deploying, and storing a Java web application.

The application is developed using Java Servlets, packaged as a WAR file using Maven, automated with Jenkins (Freestyle Job), deployed to Apache Tomcat, and stored in Nexus Repository.

---

## 🛠️ Tools & Technologies Used

* Java (Servlet)
* Maven
* Jenkins (Freestyle Job)
* Apache Tomcat
* Nexus Repository
* GitHub

---

## ⚙️ Complete Workflow (CI/CD)

1. Developer pushes code to GitHub
2. GitHub webhook triggers Jenkins job automatically
3. Jenkins pulls the latest code
4. Maven builds and packages the application into a `.war` file
5. WAR file is deployed to Apache Tomcat server
6. Artifact is uploaded to Nexus Repository
7. Application is accessible via browser

---

## 📦 Build Artifact

After successful build, the WAR file is generated:

target/github-server-1.0.war

---

## 🔄 Jenkins Job Details

* Job Type: Freestyle Project

* Build Tool: Maven

* Goal Used:
  clean package

* Build Status: ✅ SUCCESS

---

## 🚀 Deployment

* Application Server: Apache Tomcat
* Deployment Type: WAR Deployment
* Deployment Method: Automated via Jenkins

---

## 📤 Artifact Repository

The generated WAR file is uploaded to Nexus:

* Repository Manager: Sonatype Nexus
* Version: 1.0
* Artifact: github-server-1.0.war

---

## 🖥️ Application Output

The application runs successfully on Tomcat and displays a web page with links to GitHub and LinkedIn.

---

## 🔔 Automation

* GitHub webhook configured to trigger Jenkins builds automatically on every code push
* Enables continuous integration and continuous delivery with automated build, artifact management, and manual deployment.

---

## 📸 Screenshots

* Application output (browser)

  <img width="1919" height="838" alt="image" src="https://github.com/user-attachments/assets/50cd5985-f706-43ea-90cb-b49f95d02cb9" />

* Jenkins build success

  <img width="1396" height="737" alt="image" src="https://github.com/user-attachments/assets/7909e1b3-cccc-430e-be24-be45324376ad" />

* Jenkins console output

  <img width="1907" height="894" alt="image" src="https://github.com/user-attachments/assets/ca59f6b1-1fe4-4098-8a55-90972fd7aed9" />

* WAR file in target folder
  
  <img width="1482" height="715" alt="image" src="https://github.com/user-attachments/assets/fee1fbe7-d1e4-4332-bb3c-7ac93dba9721" />

* Nexus artifact upload
  
  <img width="1552" height="762" alt="image" src="https://github.com/user-attachments/assets/9f7033bd-60a2-4afc-a400-fefdf70ae71d" />

* Tomcat deployed application

  <img width="1918" height="868" alt="image" src="https://github.com/user-attachments/assets/d43fbb31-2ba4-4150-bd25-eebe1d0536cf" />

---

## 🎯 Key Learnings

* Understanding of Maven build lifecycle
* WAR packaging for Java web applications
* Jenkins job configuration (Freestyle)
* CI/CD pipeline implementation
* Artifact management using Nexus
* Webhook-based automation

---

## 👩‍💻 Author

Navya Sri Gondela
DevOps Learner 🚀
