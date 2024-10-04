FROM java:8
RUN mkdir /opt/medilab-department-service
WORKDIR /opt/medilab-department-service
COPY target/*.war /opt/medilab-department-service
CMD [ "java","-jar","PhoneBookApp-15-JRTP-0.0.1-SNAPSHOT.war" ]