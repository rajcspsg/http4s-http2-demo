Test this with below curl command

```
  curl 'https://localhost:8453/plaintext' \
  -H 'Connection: keep-alive' \
  -H 'Upgrade-Insecure-Requests: 1' \
  -H 'User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36' \
  -H 'Accept: *' \
  -H 'Accept-Language: en-US,en;q=0.9' \
  --insecure \
  --http2 -kv --http2-prior-knowledge
``` 