/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： postcss.config.js
 * 2021-1-1 - create by Tao.
 *
 */

'use strict'

module.exports = (ctx) => ({
  map: ctx.file.dirname.includes('examples') ? false : {
    inline: false,
    annotation: true,
    sourcesContent: true
  },
  plugins: {
    autoprefixer: {
      cascade: false
    }
  }
})
