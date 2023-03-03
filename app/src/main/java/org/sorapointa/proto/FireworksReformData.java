package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FireworksReformParam.*;
import org.sorapointa.proto.FireworksReformParam;

public class FireworksReformData {
    @Tag(tag=13) public Integer id = null;
    @Tag(tag=10) public List<FireworksReformParam> reformParamList = new ArrayList<>();
}
