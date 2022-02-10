module.exports = {
  outputDir: '../src/main/resources/static',
  devServer: {
      port: 9002,
      proxy: {
          "/api": {
              target: "http://localhost:9000/",
              changeOrigin: true,
              logLevel: "debug",
              secure: false
              //pathRewrite: {     "^/api": "" }
          }
      }
  }
}