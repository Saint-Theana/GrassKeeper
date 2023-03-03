package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InterpretInferenceWordReq {
    @Tag(tag=2) public Integer wordId = null;
    @Tag(tag=4) public Integer pageId = null;
}
