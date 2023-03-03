package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AssociateInferenceWordReq {
    @Tag(tag=7) public Integer baseWordId = null;
    @Tag(tag=11) public Integer pageId = null;
    @Tag(tag=2) public Integer associateWordId = null;
}
