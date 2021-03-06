package com.amplify.honeydew_server.actions;

import com.amplify.honeydew_server.Action;
import com.amplify.honeydew_server.Result;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;

import java.util.Map;

public class Click extends Action {
    public Click(UiDevice uiDevice) {
        super(uiDevice);
    }

    @Override
    public Result execute(Map<String, Object> arguments) throws UiObjectNotFoundException {
        final UiObject uiObject = getUiObject(arguments);

        if (isUiObjectAvailable(uiObject, arguments)) {
            uiObject.click();
            return Result.OK;
        }

        return Result.FAILURE;
    }
}
