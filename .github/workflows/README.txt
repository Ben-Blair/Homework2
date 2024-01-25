An attempt was made to upgrade to gradle 7.5.1 in fall 2022.  The automated testing failed because the output png files could not be created in the github actions runner.

After a lot of testing it was determined that using gradle 7.0 or 7.1 will work, but going to gradle 7.2 or higher would break the automatic testing.
The reason for this could not be determined so the upgrade to a version of gradle beyond 7.0 was delayed until spring 2023 (or summer 2023).

JDK 17 is NOT supported in gradle 7.0 or 7.1 so students will be required to use JDK 11 (the last long term support (LTS) version of the JDK prior to JDK 17).

Instructions for how to set IntelliJ to use JDK 11 will need to be added to the HW2 specification.