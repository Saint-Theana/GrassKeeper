package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FireworksReformParamType.*;
import org.sorapointa.proto.FireworksReformParamType;

public class FireworksReformParam {
    @Tag(tag=8,isSigned=true) public Integer value = null;
    @Tag(tag=11) public Integer type = null;
}
