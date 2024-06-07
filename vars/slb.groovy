def gitdownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}
def gitbiuld()
{
  sh "mvn package"
}
