package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeGetArrangementInfoReq {
    @Tag(tag=13) public List<Integer> sceneIdList = new ArrayList<>();
}
