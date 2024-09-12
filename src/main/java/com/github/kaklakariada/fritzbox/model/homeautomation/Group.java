/**
 * A Java API for managing FritzBox HomeAutomation
 * Copyright (C) 2017 Christoph Pirkl <christoph at users.sourceforge.net>
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.kaklakariada.fritzbox.model.homeautomation;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "group")
public class Group {

    @Attribute(name = "synchronized", required = false)
    private String isSynchronized;
    @Attribute(name = "identifier")
    private String identifier;
    @Attribute(name = "id")
    private String id;
    @Attribute(name = "functionbitmask")
    private int functionBitmask;
    @Attribute(name = "fwversion")
    private String firmwareVersion;
    @Attribute(name = "manufacturer")
    private String manufacturer;
    @Attribute(name = "productname")
    private String productName;
    @Element(name = "present")
    private String present;
    @Element(name = "txbusy", required = false)
    private String txBusy;
    @Element(name = "name")
    private String name;
    @Element(name = "switch", required = false)
    private SwitchState switchState;
    @Element(name = "simpleonoff", required = false)
    private SimpleOnOffState simpleOnOff;
    @Element(name = "powermeter", required = false)
    private PowerMeter powerMeter;
    @Element(name = "hkr", required = false)
    private Hkr hkr;
    @Element(name = "groupinfo", required = false)
    private GroupInfo groupInfo;
    @Element(name = "levelcontrol", required = false)
    private String levelcontrol;
    @Element(name = "level", required = false)
    private String level;
    @Element(name = "levelpercentage", required = false)
    private String levelpercentage;
    @Element(name = "colorcontrol", required = false)
    private String colorcontrol;
    @Element(name = "color", required = false)
    private String color;
    @Element(name = "hue", required = false)
    private String hue;
    @Element(name = "unmapped_hue", required = false)
    private String unmapped_hue;
    @Element(name = "saturation", required = false)
    private String saturation;
    @Element(name = "unmapped_saturation", required = false)
    private String unmapped_saturation;
    @Element(name = "temperature", required = false)
    private String temperature;

    public boolean isSynchronized() {
        return "1".equals(isSynchronized);
    }

    public String getId() {
        return id;
    }

    public int getFunctionBitmask() {
        return functionBitmask;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getProductName() {
        return productName;
    }

    public String getPresent() {
        return present;
    }

    public boolean isTxBusy() {
        return "1".equals(txBusy);
    }

    public String getName() {
        return name;
    }

    public SwitchState getSwitchState() {
        return switchState;
    }

    public SimpleOnOffState getSimpleOnOff() {
        return simpleOnOff;
    }

    public PowerMeter getPowerMeter() {
        return powerMeter;
    }

    public Hkr getHkr() {
        return hkr;
    }

    public String getIdentifier() {
        return identifier;
    }

    public GroupInfo getGroupInfo() {
        return groupInfo;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getUnmapped_saturation() {
        return unmapped_saturation;
    }

    public void setUnmapped_saturation(String unmapped_saturation) {
        this.unmapped_saturation = unmapped_saturation;
    }

    public String getSaturation() {
        return saturation;
    }

    public void setSaturation(String saturation) {
        this.saturation = saturation;
    }

    public String getUnmapped_hue() {
        return unmapped_hue;
    }

    public void setUnmapped_hue(String unmapped_hue) {
        this.unmapped_hue = unmapped_hue;
    }

    public String getHue() {
        return hue;
    }

    public void setHue(String hue) {
        this.hue = hue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorcontrol() {
        return colorcontrol;
    }

    public void setColorcontrol(String colorcontrol) {
        this.colorcontrol = colorcontrol;
    }

    public String getLevelpercentage() {
        return levelpercentage;
    }

    public void setLevelpercentage(String levelpercentage) {
        this.levelpercentage = levelpercentage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevelcontrol() {
        return levelcontrol;
    }

    public void setLevelcontrol(String levelcontrol) {
        this.levelcontrol = levelcontrol;
    }
}
