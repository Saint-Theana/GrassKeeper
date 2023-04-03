package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FireworksReformParam.*;
import org.sorapointa.proto.FireworksReformParam;

public class FireworksReformData {
    @Tag(tag=2) public List<FireworksReformParam> reformParamList = new ArrayList<>();
    @Tag(tag=7) public Integer id = null;
}
