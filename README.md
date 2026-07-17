# GitHub Actions Android CI/CD Demo

Minimal Android project for testing branch-based GitHub Actions.

| Event | Result |
| --- | --- |
| Pull request to `develop` or `main` | Unit test + lint |
| Push to `develop` | Unit test + lint + downloadable debug APK artifact |
| Push to `main` | Unit test + lint + downloadable unsigned release AAB artifact |

## First use

1. Create an empty GitHub repository, then add it as `origin`.
2. Push `main`, then create and push `develop`.
3. Open the **Actions** tab and inspect the workflow run. On `develop`, download the APK from the run's **Artifacts** section.

The AAB is deliberately unsigned. Add a protected release workflow and GitHub Secrets only when you are ready to distribute externally.
