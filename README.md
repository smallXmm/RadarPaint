# Radar
雷达图

##提供方法  
```
 //设置标题
    public void setTitles(String[] titles) {
        this.titles = titles;
    }

    //设置数值
    public void setData(double[] data) {
        this.data = data;
    }


    public float getMaxValue() {
        return maxValue;
    }

    //设置最大数值
    public void setMaxValue(float maxValue) {
        this.maxValue = maxValue;
    }
    //设置标题颜色
    public void setTextPaintColor(int color){
        textPaint.setColor(color);
    }

    //设置覆盖局域颜色
    public void setValuePaintColor(int color){
        valuePaint.setColor(color);

    }
    //设置雷达图颜色
    public void setMainPaintColor(int color){
        radarPaint.setColor(color);
    }
```  

###其他 
* 默认wrapcontent=300dp  
* 默认MaxValue=100
* 请不要设置过长标题名

    
