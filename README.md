ActionsLab-SukhmanAulakh

Automated CI pipeline for a simple Java app that builds, then tests (sequential jobs with dependencies).

What's included:
- Calculator.java — simple class with add and subtract
- .github/workflows/build-pipeline.yml — sequential jobs workflow that runs on push to main

How to use:
- Create a new public GitHub repo named ActionsLab-SukhmanAulakh (or adjust name as needed).
- Initialize git, commit, and push from this folder.
- Make a tiny change to Calculator.java and push again to see a second run.

Deliverables to capture:
- Screenshot of .github/workflows/build-pipeline.yml in the repo
- Screenshot of the Actions run graph showing build → test completed in sequence