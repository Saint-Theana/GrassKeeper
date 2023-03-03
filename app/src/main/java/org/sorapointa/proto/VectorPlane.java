package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VectorPlane {
    @Tag(tag=1,isFloat=true) public Float x = null;
    @Tag(tag=2,isFloat=true) public Float y = null;
}
