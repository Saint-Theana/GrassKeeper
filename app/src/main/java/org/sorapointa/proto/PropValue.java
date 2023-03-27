package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PropValue {
    @Tag(tag=1) public Integer type = null;
    @Tag(tag=2,isSigned=true) public Long ival = null;
    @Tag(tag=3,isFloat=true) public Float fval = null;
    @Tag(tag=4,isSigned=true) public Long val = null;
}
