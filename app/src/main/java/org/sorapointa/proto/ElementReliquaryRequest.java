package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ElementReliquaryRequest {
    @Tag(tag=12) public Integer elementType = null;
    @Tag(tag=7) public Integer equipType = null;
}
