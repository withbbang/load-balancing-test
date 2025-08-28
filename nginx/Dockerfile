FROM nginx:latest
COPY load-balancing-test.conf /etc/nginx/conf.d/default.conf

# 따로 build해서 Prod repo에 올리는 법
# $ cd nginx
# $ docker buildx build -t [image_name]:[tag] . // 이미지 빌드
# $ docker buildx build -t load-balancing-test-nginx:latest . // 이미지 빌드 커맨드 예시
# $ docker tag [image_name]:[tag] [repo_name]/[image_name]:[tag] // 이미지 태그
# $ docker tag load-balancing-test-nginx:latest withbbang/load-balancing-test-nginx:latest // 이미지 태그 예시
# $ docker push [repo_name]/[image_name]:[tag] // 이미지 푸시
# $ docker push withbbang/load-balancing-test-nginx:latest // 이미지 푸시 예시