package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LuaEnvironmentEffectNotify {
    @Tag(tag=1) public Integer type = null;
    @Tag(tag=12,isSigned=true) public List<Integer> intParamList = new ArrayList<>();
    @Tag(tag=3) public String effectAlias = null;
    @Tag(tag=14,isFloat=true) public List<Float> floatParamList = new ArrayList<>();
}
