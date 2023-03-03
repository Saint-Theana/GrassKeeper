package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MsgParam {
    @Tag(tag=9) public Integer intParam = null;
    @Tag(tag=7,isFloat=true) public Float fltParam = null;
    @Tag(tag=4) public String strParam = null;
}
