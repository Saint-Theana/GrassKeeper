package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CutSceneExtraParam {
    @Tag(tag=3,isFloat=true) public List<Double> detailParamList = new ArrayList<>();
}
