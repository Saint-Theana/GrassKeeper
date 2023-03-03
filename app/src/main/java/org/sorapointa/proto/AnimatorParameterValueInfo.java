package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AnimatorParameterValueInfo {
    @Tag(tag=1) public Integer paraType = null;
    @Tag(tag=2,isSigned=true) public Integer intVal = null;
    @Tag(tag=3,isFloat=true) public Float floatVal = null;
    @Tag(tag=4) public Boolean boolVal = null;
}
