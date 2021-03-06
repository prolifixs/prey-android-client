/*******************************************************************************
 * Created by Orlando Aliaga
 * Copyright 2015 Prey Inc. All rights reserved.
 * License: GPLv3
 * Full license at "/LICENSE"
 ******************************************************************************/
package com.prey.json.actions;

import android.content.Context;

import com.prey.PreyConfig;
import com.prey.PreyLogger;
import com.prey.actions.geofences.GeofenceController;
import com.prey.actions.observer.ActionResult;

import org.json.JSONObject;

import java.util.List;

public class Geofencing {

    public void start(Context ctx, List<ActionResult> list, JSONObject parameters) {
        PreyLogger.d("starting Geofencing");
        String messageId = null;
        try {
            messageId = parameters.getString(PreyConfig.MESSAGE_ID);
            PreyLogger.d("messageId:"+messageId);
        } catch (Exception e) {
        }
        GeofenceController.getInstance().run(ctx);
    }

    public void stop(Context ctx, List<ActionResult> list, JSONObject parameters) {
        PreyLogger.d("stop Geofencing");
        String messageId = null;
        try {
            messageId = parameters.getString(PreyConfig.MESSAGE_ID);
        } catch (Exception e) {
        }
        GeofenceController.getInstance().run(ctx);
    }

}