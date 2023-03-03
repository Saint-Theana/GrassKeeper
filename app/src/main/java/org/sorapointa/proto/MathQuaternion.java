package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MathQuaternion {
    @Tag(tag=1,isFloat=true) public Float x = null;
    @Tag(tag=2,isFloat=true) public Float y = null;
    @Tag(tag=3,isFloat=true) public Float z = null;
    @Tag(tag=4,isFloat=true) public Float w = null;
}
