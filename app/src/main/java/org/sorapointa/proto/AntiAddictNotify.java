package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AntiAddictNotify {
    @Tag(tag=6,isSigned=true) public Integer msgType = null;
    @Tag(tag=3) public String msg = null;
    @Tag(tag=5) public String level = null;
}
