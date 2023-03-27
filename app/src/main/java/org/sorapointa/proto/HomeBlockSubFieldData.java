package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeBlockSubFieldData {
    @Tag(tag=6) public Vector rot = null;
    @Tag(tag=11) public Vector pos = null;
}
