package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RegionalPlayVar {
    @Tag(tag=4,isFloat=true) public Float baseValue = null;
    @Tag(tag=15,isFloat=true) public Float maxValue = null;
    @Tag(tag=8) public Integer type = null;
    @Tag(tag=12,isFloat=true) public Float value = null;
}
