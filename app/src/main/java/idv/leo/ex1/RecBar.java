package idv.leo.ex1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 202 on 2015/3/26.
 */
public class RecBar extends View {
    private Paint paint = new Paint();
    private Rect rect = new Rect();

    public RecBar(Context context) {
        super(context);
    }

    public RecBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int i = 100;
        paint.setColor(Color.YELLOW);


        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.FILL);
        int left = i;
        int right = i + 500;
        int top = i;
        int down = i + 500;
        rect.set(left, top, right, down);
        paint.setColor(Color.YELLOW);
        canvas.drawRect(rect, paint);

    }
}
