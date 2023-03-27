package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlaceInfo {
    @Tag(tag=1) public Vector pos = null;
    @Tag(tag=2) public Vector rot = null;
}
